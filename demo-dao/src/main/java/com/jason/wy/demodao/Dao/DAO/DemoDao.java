package com.jason.wy.demodao.Dao.DAO;

import com.jason.wy.demodao.Dao.DO.MemberDO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wangyuan02
 * @desc
 * @date 2019-06-06 10:33
 */

@Repository("demoDao")
public interface DemoDao {


    List<MemberDO> findAllUser();
}
