show tables;

select * from jd_brand;
select * from jd_show_pic;
select * from jd_product;

UPDATE jd_product set picture = 'http://pjv3h15g0.bkt.clouddn.com/iPhoneXR(1).jpg' where prod_no = 5;

UPDATE jd_product set prod_name = 'Apple iPhone XR 全网通（移动4G优先版） 双卡双待' where prod_no =5;
-- 添加展示图
insert into jd_show_pic VALUES
  (0,'iPhone7Plus(5).jpg',1),
  (0,'iPhone7Plus(2).jpg',1),
  (0,'iPhone7Plus(3).jpg',1),
  (0,'iPhone7Plus(4).jpg',1);


select * from jd_product;
select * from jd_sku;
select * from jd_spec;
select * from jd_spec_value;
select * from jd_sku_spec_value;

select * from jd_spec where id in (select spec_id from jd_spu_spec s where s.spu_id = 1);
select * from jd_spec_value where spec_id in (1,2);

select id, spec_no, spec_name, gmt_create, gmt_update
from jd_spec where id IN
                   (select spec_id from jd_spu_spec where spu_id = 1);

select * from jd_spec_value where spec_id = 1;
select * from jd_spec_value where spec_id = 2;
select * from jd_user;
select * from jd_product;
-- 查询销量的SKU
select * from jd_product order by sales DESC limit 5;

select * from jd_sku;

select * from jd_cart where user_id = 1;
alter table jd_cart drop column ststus;

select * from jd_user;





