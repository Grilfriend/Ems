package com.qhit.reports;

import com.qhit.baseUser.pojo.BaseUser;
import com.qhit.produceReport.service.IProduceReportService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * Created by 17194 on 2018/4/20
 */
@RestController
@RequestMapping("/devInfo")
public class DevInfo {
    @Resource
    IProduceReportService produceReportService;

    /**
     * 港口间设备利用率对比
     * @param year
     * @return
     */
    @RequestMapping("/usage")
    public Map<String,Object> usage(String year){
        return produceReportService.usage(year);
    }

    /**
     * 2、港口间设备完好率对比：
     * @param year
     * @return
     */
    @RequestMapping("/intactRatio")
    public Map<String,Object> intactRatio(String year){
        return produceReportService.intactRatio(year);
    }

    /**
     * 成本核算信息：
     * @param year
     * @param session
     * @return
     */
    @RequestMapping("/cost")
    public List<Map> cost(String year, HttpSession session){
        BaseUser baseUser = (BaseUser) session.getAttribute("baseUser");
        return produceReportService.cost(year,baseUser.getCompid());
    }

    /**
     * 港口间作业量对比
     * @param year
     * @return
     */
    @RequestMapping("/amount")
    public Map<String,Object> amount(String year){
        return produceReportService.amount(year);
    }

    /**
     * 港口间能耗对比
     * @param year
     * @return
     */
    @RequestMapping("/consume")
    public Map<String,Object> consume(String year){
        return produceReportService.consume(year);
    }
}
