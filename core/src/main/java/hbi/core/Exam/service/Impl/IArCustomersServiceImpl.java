package hbi.core.Exam.service.Impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import hbi.core.Exam.dto.ArCustomers;
import hbi.core.Exam.mapper.ArCustomersMapper;
import hbi.core.Exam.service.IArCustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 李璇 on 2017/1/10.
 */
@Service("iArCustomersService")
public class IArCustomersServiceImpl extends BaseServiceImpl<ArCustomers> implements IArCustomersService {
    @Autowired
    private ArCustomersMapper arCustomersMapper;


}
