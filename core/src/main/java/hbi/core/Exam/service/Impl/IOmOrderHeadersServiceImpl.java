package hbi.core.Exam.service.Impl;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import hbi.core.Exam.dto.OmOrderHeaders;
import hbi.core.Exam.mapper.OmOrderHeadersMapper;
import hbi.core.Exam.service.IOmOrderHeadersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 李璇 on 2017/1/10.
 */
@Service("iOmOrderHeadersService")
public class IOmOrderHeadersServiceImpl extends BaseServiceImpl<OmOrderHeaders> implements IOmOrderHeadersService {

    @Autowired
   private OmOrderHeadersMapper omOrderHeadersMapper;

    @Override
    public List<OmOrderHeaders> findOrderBy(IRequest iRequest, OmOrderHeaders omOrderHeaders, int page, int pageSize) {

        List<OmOrderHeaders> orderList = omOrderHeadersMapper.findOrderBy(omOrderHeaders);
        return orderList;
    }
}
