CREATE DATABASE mydatabase;

USE mydatabase;

CREATE TABLE numbers (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    number INT NOT NULL
);


CREATE TABLE t_user_info123 (
    user_name  varchar(50) /*이름*/
);

--고객 정보 user_info
CREATE TABLE t_user_info (
    user_name  varchar(50), /*이름*/
    user_id  varchar(50), /*아이디*/
    user_pw  varchar(50),  /*패스워드*/
    user_email  varchar(50)  /*이메일주소*/
);

-- 선수정보 runner_info
CREATE TABLE t_runner_info (
    runner_name varchar(50), /*이름*/
    runner_age int, /*나이*/
    runner_group varchar(50), /*소속*/
    runner_weight int, /*몸무게*/
    runner_hight int, /*키*/
    runner_win_rate float/*승률*/
);


-- 시간정보 race_info
CREATE TABLE t_race_info (
    runner_name varchar(50), /*선수명*/
    race_dy varchar(50), /*일자*/
    race_cnt int, /*회차*/
    meet_no varchar(50) /*시행처*/
);

-- 승자정보 winner_info
CREATE TABLE t_winner_info (
    user_name varchar(50), /*고객명*/
    race_no varchar(50), /*경주번호*/
    win_type varchar(50), /*승식*/
    race_amt int, /*배팅금액*/
    win_rate float, /*배당*/
    ret_amt int/*환불금액*/
);


-- 구매정보 sell
CREATE TABLE t_sell(
    user_name varchar(50), /*고객명*/
    race_no varchar(50), /*경주번호*/
    win_type varchar(50), /*승식*/
    runner_no varchar(50), /*선수선택(1번~7번)*/
    bet_amt int, /*배팅금액*/
    win_rate float,/*배당*/
    ret_amt int/*환불금액  */
);

