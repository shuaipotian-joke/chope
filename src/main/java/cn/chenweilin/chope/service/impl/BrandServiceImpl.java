package cn.chenweilin.chope.service.impl;

import cn.chenweilin.chope.dao.BrandDao;
import cn.chenweilin.chope.entity.BrandEntity;
import cn.chenweilin.chope.service.BrandService;
import cn.chenweilin.chope.utils.PageUtils;
import cn.chenweilin.chope.utils.Query;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("brandService")
public class BrandServiceImpl extends ServiceImpl<BrandDao, BrandEntity> implements BrandService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BrandEntity> page = this.page(
                new Query<BrandEntity>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }
}
