package hbi.core.Exam.controllers;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import hbi.core.Exam.dto.OmOrderHeaders;
import hbi.core.Exam.service.IOmOrderHeadersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by 李璇 on 2017/1/13.
 */

@RestController
@RequestMapping("/exam")
public class ExamController extends BaseController {

    @Autowired
    IOmOrderHeadersService orderHeadersService;

//    @Autowired
//    IOmOrderLinesService iOmOrderLinesService;

    @RequestMapping(
            value = {"/query"},
            method = RequestMethod.POST)
    public ResponseData select(HttpServletRequest request,
                               @RequestBody OmOrderHeaders omOrderHeaders ) {
        IRequest requestContext = this.createRequestContext(request);
        List<OmOrderHeaders> orderList = this.orderHeadersService.findOrderBy(requestContext,omOrderHeaders,omOrderHeaders.getPage(),omOrderHeaders.getPagesize());
        System.out.print("omOrderHeaders   ==================="+omOrderHeaders);
        System.out.print("orderList in controller   ==============="+orderList);
        return new ResponseData(orderList) ;
    }

//    @RequestMapping(
//            value = {"/add"},
//            method = RequestMethod.POST)
//    public  ResponseData insert( HttpServletRequest request,
//                                 @RequestBody OmOrderHeaders omOrderHeaders) {
//        IRequest requestContext = this.createRequestContext(request);
//        orderHeadersService.insertSelective(requestContext,omOrderHeaders);
//        iOmOrderLinesService.insertSelective(requestContext,omOrderHeaders.getLines());
//
//        OmOrderHeaders head = new OmOrderHeaders();
//        List<OmOrderHeaders> orderList = this.orderHeadersService.findOrderBy(requestContext,head,head.getPage(),head.getPagesize());
//        return new ResponseData(orderList) ;
//    }





}
