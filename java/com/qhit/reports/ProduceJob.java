package com.qhit.reports;

import com.qhit.baseCompany.service.impl.BaseCompanyServiceImpl;
import com.qhit.baseDevice.service.IBaseDeviceService;
import com.qhit.baseDevtype.service.IBaseDevtypeService;
import com.qhit.baseFlow.service.IBaseFlowService;
import com.qhit.baseUser.pojo.BaseUser;
import com.qhit.produceJob.service.impl.ProduceJobServiceImpl;
import com.qhit.produceReport.pojo.ProduceReport;
import com.qhit.produceReport.service.IProduceReportService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by HP on 2018/4/24
 */
@RestController
@RequestMapping("/produceJob")
public class ProduceJob {
    @Resource
    IBaseFlowService baseFlowService;
    @Resource
    IProduceReportService produceReportService;
    @Resource
    ProduceJobServiceImpl produceJobService;

    @RequestMapping("/model")
    public Object model(String year,HttpSession session){
        Map map = new HashMap();
        BaseUser baseUser = (BaseUser) session.getAttribute("baseUser");
        Integer compid = baseUser.getCompid();
        ProduceReport year1 = produceReportService.findYear(year, compid);
        List<Map> flowamount = baseFlowService.flowamount(year, compid);

        for (int i = 0; i <flowamount.size() ; i++) {
            int flowid = (int)flowamount.get(i).get("flowid");
            List<Map> devamount = produceJobService.devamount(year, flowid);
            flowamount.get(i).put("children",devamount);
        }
        map.put("comp",year1.getCompname());
        map.put("amount",year1.getCapacity());
        map.put("children",flowamount);

        return  map;
    }

}
