package cn.edu.zjnu.STService.Dao;

import cn.edu.zjnu.STService.Model.Firm;

import java.util.List;

public interface FirmMapper {
    Firm findOneByName(String name);

    int add(Firm record);

    int delById(Integer id);

    int updateById(Firm record);

    List<Firm> findAllFirm(Firm firm);

    Firm findOneById(Integer id);



}