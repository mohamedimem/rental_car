DROP DATABASE IF EXISTS STARAUTO;
CREATE DATABASE STARAUTO;
USE STARAUTO;

CREATE TABLE Fonctionnaire (
Username varchar(20),
Password varchar(20),
CIN int Primary Key,
Nom varchar(20),
Prenom varchar(20),
tel int,
email varchar(50),
adresse varchar(100));

CREATE TABLE Client(
CIN Int primary KEY,
Nom Varchar(20),
Prenom Varchar(20),
tel int,
email varchar(50),
adresse varchar(100));

CREATE TABLE Modele(
Marque varchar(20) NOT NULL,
Type_vehicule varchar(20) NOT NULL,
PrixParJour float,
Primary Key (Marque,Type_vehicule));

CREATE TABLE Vehicule(
NumMatricule int NOT NULL Primary Key,
etat varchar(20),
Marque varchar(20),
Type_vehicule varchar(20), 
FOREIGN KEY (Marque,Type_vehicule) REFERENCES Modele(Marque,Type_Vehicule));

CREATE TABLE Reservation(
Num_res int NOT NULL,
CIN_Client int NOT NULL,
NumMatricule int NOT NULL,
Date_debut Date,
Date_retour Date,
Primary key (Num_res,CIN_Client,NumMatricule),
foreign key (CIN_Client) REFERENCES Client(CIN),
foreign key (NumMatricule) REFERENCES Vehicule(NumMatricule));

