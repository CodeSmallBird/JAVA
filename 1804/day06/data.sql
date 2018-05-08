DROP TABLE IF EXISTS tb_order_detail;

/*==============================================================*/
/* Table: tb_order_detail                                       */
/*==============================================================*/
CREATE TABLE tb_order_detail
(
   id                   INT NOT NULL AUTO_INCREMENT,
   order_id             INT,
   num                  TINYINT,
   item                 VARCHAR(300),
   price                DOUBLE(8,2),
   PRIMARY KEY (id)
);

ALTER TABLE tb_order_detail ADD CONSTRAINT FK_Reference_2 FOREIGN KEY (tb_order)
      REFERENCES tb_order (id) ON DELETE RESTRICT ON UPDATE RESTRICT;
