package com.jubi.controller;

import com.jubi.service.CoinService;
import com.jubi.service.TickerRateService;
import com.jubi.service.vo.CoinVo;
import com.jubi.service.vo.TickerRateVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 负责页面跳转
 * Created by Administrator on 2017/7/30.
 */
@Controller
@RequestMapping("/page")
public class PageController {

    @Autowired
    private CoinService coinService;

    @Autowired
    private TickerRateService tickerRateService;

    @RequestMapping("/index.html")
    public ModelAndView index() {
        List<TickerRateVo> rankedRate = tickerRateService.queryRankedTickerRate();

        ModelAndView mv = new ModelAndView();
        mv.addObject("rankedRate", rankedRate);
        mv.setViewName("index");

        return mv;
    }

    @RequestMapping("login.html")
    public String login() {
        return "login";
    }

    @RequestMapping("/ticker.html")
    public ModelAndView tickerPage() {
        List<CoinVo> coins = coinService.getAllCoins();

        ModelAndView mv = new ModelAndView();
        mv.addObject("coins", coins);
        mv.setViewName("ticker");

        return mv;
    }

    @RequestMapping("/recent/ticker.html")
    public ModelAndView tickerRecnetPage() {
        List<CoinVo> coins = coinService.getAllCoins();

        ModelAndView mv = new ModelAndView();
        mv.addObject("coins", coins);
        mv.setViewName("ticker-recent");

        return mv;
    }

    @RequestMapping("/history/ticker.html")
    public ModelAndView tickerHistoryPage() {
        List<CoinVo> coins = coinService.getAllCoins();

        ModelAndView mv = new ModelAndView();
        mv.addObject("coins", coins);
        mv.setViewName("ticker-history");

        return mv;
    }

    @RequestMapping("/rate.html")
    public ModelAndView ratePage() {
        List<CoinVo> coins = coinService.getAllCoins();

        ModelAndView mv = new ModelAndView();
        mv.addObject("coins", coins);
        mv.setViewName("ticker-rate");

        return mv;
    }

    @RequestMapping("/recent/rate.html")
    public ModelAndView rateRecentPage() {
        List<CoinVo> coins = coinService.getAllCoins();

        ModelAndView mv = new ModelAndView();
        mv.addObject("coins", coins);
        mv.setViewName("ticker-recent-rate");

        return mv;
    }

    @RequestMapping("/history/rate.html")
    public ModelAndView rateHistoryPage() {
        List<CoinVo> coins = coinService.getAllCoins();

        ModelAndView mv = new ModelAndView();
        mv.addObject("coins", coins);
        mv.setViewName("ticker-history-rate");

        return mv;
    }

    @RequestMapping("/coin/depth/cmp.html")
    public String coinDepthCmpPage() {
        return "coin-depth-cmp";
    }

    @RequestMapping("/coin/depth/history.html")
    public ModelAndView coinDepthHistoryPage() {
        List<CoinVo> coins = coinService.getAllCoins();

        ModelAndView mv = new ModelAndView();
        mv.addObject("coins", coins);
        mv.setViewName("coin-depth-history");

        return mv;
    }

    @RequestMapping("/coin/order.html")
    public ModelAndView coinOrderQueryPage() {
        List<CoinVo> coins = coinService.getAllCoins();

        ModelAndView mv = new ModelAndView();
        mv.addObject("coins", coins);
        mv.setViewName("coin-order");

        return mv;
    }

    @RequestMapping("/coin/order/info.html")
    public ModelAndView coinOrderInfoPage() {
        List<CoinVo> coins = coinService.getAllCoins();

        ModelAndView mv = new ModelAndView();
        mv.setViewName("coin-info");

        return mv;
    }
}
