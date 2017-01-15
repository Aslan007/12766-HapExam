package hbi.core.Exam.service;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.IBaseService;
import hbi.core.Exam.dto.OmOrderHeaders;

import java.util.List;

/**
 * Created by 李璇 on 2017/1/10.
 */
public interface IOmOrderHeadersService extends IBaseService<OmOrderHeaders> {


    public List<OmOrderHeaders> findOrderBy(IRequest iRequest, OmOrderHeaders omOrderHeaders, int page, int pageSize);

}
