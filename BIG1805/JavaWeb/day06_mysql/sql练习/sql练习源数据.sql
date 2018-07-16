-- ----------------------------
-- mysql��ϰsql�ű�
-- ----------------------------
create database db10;			-- ����db10���ݿ�
use db10;						-- �л���db10���ݿ�
create table dept(				-- �������ű�
	deptno int primary key,		-- ���ű��
	deptname varchar(50),		-- ��������
	loc varchar(50)				-- ����λ��
);
create table emp(				-- ����Ա����
	empno int primary key,		-- Ա�����
	empname varchar(50),		-- Ա������
	job varchar(50),			-- ְλ
	mgr int,					-- ֱ���ϼ�
	hiredate date,				-- �ܹ�����
	sal int,					-- н��
	comm int,					-- ����
	deptno int,					-- ���ڲ��ű��
	foreign key(deptno) references dept(deptno)
);
-- ----------------------------
-- Records of dept ���ű�����
-- ----------------------------
INSERT INTO `dept` VALUES ('10', '��Ʋ�', '����');
INSERT INTO `dept` VALUES ('20', '���鲿', '����');
INSERT INTO `dept` VALUES ('30', '���۲�', '�Ϻ�');
INSERT INTO `dept` VALUES ('40', 'Ӫ����', '����');


-- ----------------------------
-- Records of emp Ա��������
-- ----------------------------
INSERT INTO `emp` VALUES ('7369', '���޼�', '����Ա', '7902', '1980-12-17', '800', null, '20');
INSERT INTO `emp` VALUES ('7499', '�ܲ�', '����Ա', '7698', '1981-02-20', '1600', '300', '30');
INSERT INTO `emp` VALUES ('7521', '��־', '����Ա', '7698', '1981-02-22', '1250', '500', '30');
INSERT INTO `emp` VALUES ('7566', '��Ԫ�', '����', '7839', '1981-04-02', '2975', null, '20');
INSERT INTO `emp` VALUES ('7654', '������', '����Ա', '7698', '1981-09-28', '1250', '1400', '30');
INSERT INTO `emp` VALUES ('7698', '������', '����', '7839', '1981-05-01', '2850', null, '30');
INSERT INTO `emp` VALUES ('7782', '����', '����', '7839', '1981-06-09', '2450', null, '10');
INSERT INTO `emp` VALUES ('7788', '�ν�', '����Ա', '7566', '1987-04-19', '3000', null, '20');
INSERT INTO `emp` VALUES ('7839', '������', '���³�', null, '1981-11-17', '5000', null, '10');
INSERT INTO `emp` VALUES ('7844', '�����', '����Ա', '7698', '1981-09-08', '1500', '0', '30');
INSERT INTO `emp` VALUES ('7876', '�ŷ�', '����Ա', '7788', '1987-05-23', '1100', null, '20');
INSERT INTO `emp` VALUES ('7900', '����', '����Ա', '7698', '1981-12-03', '950', null, '30');
INSERT INTO `emp` VALUES ('7902', '�����', '����Ա', '7566', '1981-12-03', '3000', null, '20');
INSERT INTO `emp` VALUES ('7934', '�ĺ', '����Ա', '7782', '1982-01-23', '1300', null, '10');




