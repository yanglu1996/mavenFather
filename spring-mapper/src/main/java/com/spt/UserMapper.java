package com.spt;

/**
 * @author: yang lu
 * @time: 2019/12/14 14:35
 */
public interface UserMapper {

    /**
     * @param id
     * @return
     */
    User getUser(Integer id);

    /**
     * @param id
     * @return
     */
    int deleteUser(Integer id);
}
