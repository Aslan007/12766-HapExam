package hbi.core.Exam.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.core.Exam.dto.OmOrderHeaders;

import java.util.List;

/**
 * Created by 李璇 on 2017/1/10.
 */
public interface OmOrderHeadersMapper extends Mapper<OmOrderHeaders> {

    public List<OmOrderHeaders> findOrderAll();

    public List<OmOrderHeaders> findOrderBy(OmOrderHeaders omOrderHeaders);
}
