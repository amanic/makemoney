package com.martea.makemoney.controller;

import com.martea.makemoney.model.CateResult;
import com.martea.makemoney.model.ResultVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author haitao.chen
 * @date 2020/11/29
 */
@RestController
@RequestMapping("api")
public class ItemController {


    /**
     * this.category = [{cate_name:'海王',children:[{cate_name:'海王1',pic:'',id:1}]},
     *       {cate_name:'樱花',children:[{cate_name:'樱花2',pic:'',id:2}]},
     *       {cate_name:'秒速',children:[{cate_name:'秒速3',pic:'',id:3}]},
     *       {cate_name:'头盔',children:[{cate_name:'头盔4',pic:'',id:4}]},
     *       {cate_name:'三厘米',children:[{cate_name:'三厘米6',pic:'',id:5}]},
     *       {cate_name:'言叶之庭',children:[{cate_name:'言叶之庭',pic:'',id:6}]},
     *       {cate_name:'雨天',children:[{cate_name:'雨天',pic:'',id:7}]},
     *       {cate_name:'路费',children:[{cate_name:'雨天',pic:'',id:8}]},
     *       {cate_name:'你好',children:[{cate_name:'雨天',pic:'',id:9}]},
     *       {cate_name:'世界',children:[{cate_name:'雨天',pic:'',id:10}]},];
     *         this.$nextTick(() => {
     *           if (this.$route.params.pid) this.activeCateId(this.$route.params.pid);
     *           else this.onScroll();
     *         });
     */
    @RequestMapping("category")
    public ResultVO<CateResult> getCategory(){
        CateResult cateResult = new CateResult();
        CateResult.ChildCate childCate = new CateResult.ChildCate();
        cateResult.setCate_name("海王");
        cateResult.setChildren(childCate);
        childCate.setId(1);
        childCate.setCate_name("我是小姐姐");
        childCate.setPic("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQXq6yZOZeWQ6zfpkkgyZw9Euz4ttBWtJ2FUg&usqp=CAU");
        ResultVO<CateResult> resultVO = new ResultVO<>();
        resultVO.setData(cateResult);
        resultVO.setMsg("");
        resultVO.setSuccess(true);
        return resultVO;
    }

}
