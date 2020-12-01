package com.martea.makemoney.model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

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
 * @author haitao.chen
 * @date 2020/11/29
 */
@Data
public class CateResult implements Serializable {

    private String cate_name;

    private ChildCate children;

    @Data
    public static class ChildCate implements Serializable{
        private String cate_name;

        private String pic;

        private Integer id;



    }
}

