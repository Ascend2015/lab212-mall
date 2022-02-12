package cn.lab212.mall.mapper;

import cn.lab212.mall.model.UmsMemberProductCategoryRelation;
import cn.lab212.mall.model.UmsMemberProductCategoryRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberProductCategoryRelationMapper {
    long countByExample(UmsMemberProductCategoryRelationExample example);

    int deleteByExample(UmsMemberProductCategoryRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberProductCategoryRelation record);

    int insertSelective(UmsMemberProductCategoryRelation record);

    List<UmsMemberProductCategoryRelation> selectByExample(UmsMemberProductCategoryRelationExample example);

    UmsMemberProductCategoryRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsMemberProductCategoryRelation record, @Param("example") UmsMemberProductCategoryRelationExample example);

    int updateByExample(@Param("record") UmsMemberProductCategoryRelation record, @Param("example") UmsMemberProductCategoryRelationExample example);

    int updateByPrimaryKeySelective(UmsMemberProductCategoryRelation record);

    int updateByPrimaryKey(UmsMemberProductCategoryRelation record);
}