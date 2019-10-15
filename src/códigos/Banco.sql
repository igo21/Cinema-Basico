/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Igor Ramos
 * Created: 08/06/2019
 */

create database cinema;
use cinema;

create table Filme(
id int not null auto_increment primary key unique,
nome varchar(80) not null,
ano varchar(20) not null,
Categoria Varchar(50) not null,
Diretor Varchar(80)
);

use cinema;
select * from filme;