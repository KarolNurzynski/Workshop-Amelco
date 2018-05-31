-- MySQL dump 10.13  Distrib 5.7.22, for Linux (x86_64)
--
-- Host: localhost    Database: events24
-- ------------------------------------------------------
-- Server version	5.7.22-0ubuntu0.17.10.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bet`
--

DROP TABLE IF EXISTS `bet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bet` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `bet_offer_id` bigint(20) DEFAULT NULL,
  `event_id` bigint(20) DEFAULT NULL,
  `max_user_lose` decimal(19,2) DEFAULT NULL,
  `max_user_win` decimal(19,2) DEFAULT NULL,
  `probability_user_wins` decimal(19,2) DEFAULT NULL,
  `stake` decimal(19,2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK6onmvpfj92pqv97ju5bt6m18w` (`bet_offer_id`),
  KEY `FKor3gcvxfkvwbwqgeqthboxwn4` (`event_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bet`
--

LOCK TABLES `bet` WRITE;
/*!40000 ALTER TABLE `bet` DISABLE KEYS */;
/*!40000 ALTER TABLE `bet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bet_offer`
--

DROP TABLE IF EXISTS `bet_offer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bet_offer` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `bet_type_id` bigint(20) DEFAULT NULL,
  `odds` decimal(19,2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKk961lxhca8f71ex43rc0b0cq` (`bet_type_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bet_offer`
--

LOCK TABLES `bet_offer` WRITE;
/*!40000 ALTER TABLE `bet_offer` DISABLE KEYS */;
/*!40000 ALTER TABLE `bet_offer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bet_type`
--

DROP TABLE IF EXISTS `bet_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bet_type` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `draw` bit(1) NOT NULL,
  `team1score` int(11) DEFAULT NULL,
  `team1time_less_than` time DEFAULT NULL,
  `team1wins` bit(1) NOT NULL,
  `team2score` int(11) DEFAULT NULL,
  `team2time_less_than` time DEFAULT NULL,
  `team2wins` bit(1) NOT NULL,
  `team3score` int(11) DEFAULT NULL,
  `team3time_less_than` time DEFAULT NULL,
  `team3wins` bit(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bet_type`
--

LOCK TABLES `bet_type` WRITE;
/*!40000 ALTER TABLE `bet_type` DISABLE KEYS */;
/*!40000 ALTER TABLE `bet_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `event`
--

DROP TABLE IF EXISTS `event`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `event` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `local_date_time` datetime DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `league_id` bigint(20) DEFAULT NULL,
  `region_id` bigint(20) DEFAULT NULL,
  `sport_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK2oontqepc8mddwomq8jdynrrg` (`league_id`),
  KEY `FKjo3inaua6ckdrr2qeehh9225v` (`region_id`),
  KEY `FKjm09l8eudbov62gdaayyb7nfb` (`sport_id`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `event`
--

LOCK TABLES `event` WRITE;
/*!40000 ALTER TABLE `event` DISABLE KEYS */;
INSERT INTO `event` VALUES (1,'2018-06-10 20:00:00','A Polish football league 1 game example',1,1,1),(2,'2018-06-11 20:00:00','Tennis worldcup1 game example',4,2,2),(3,'2018-06-12 20:00:00','Horse race worldcup1 example',8,2,3);
/*!40000 ALTER TABLE `event` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `event_details`
--

DROP TABLE IF EXISTS `event_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `event_details` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `team1score` varchar(255) DEFAULT NULL,
  `team1time` time DEFAULT NULL,
  `team2score` varchar(255) DEFAULT NULL,
  `team2time` time DEFAULT NULL,
  `team3score` varchar(255) DEFAULT NULL,
  `team3time` time DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `event_details`
--

LOCK TABLES `event_details` WRITE;
/*!40000 ALTER TABLE `event_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `event_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `event_details_bet_types`
--

DROP TABLE IF EXISTS `event_details_bet_types`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `event_details_bet_types` (
  `event_detail_id` bigint(20) NOT NULL,
  `bet_types_id` bigint(20) NOT NULL,
  KEY `FKpdaj52cwlmntiily0q1f9aeyk` (`bet_types_id`),
  KEY `FKl4dah5cx6y4mndraet7xobb12` (`event_detail_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `event_details_bet_types`
--

LOCK TABLES `event_details_bet_types` WRITE;
/*!40000 ALTER TABLE `event_details_bet_types` DISABLE KEYS */;
/*!40000 ALTER TABLE `event_details_bet_types` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `event_details_events`
--

DROP TABLE IF EXISTS `event_details_events`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `event_details_events` (
  `event_details_id` bigint(20) NOT NULL,
  `events_id` bigint(20) NOT NULL,
  KEY `FKcl4sdtug2a8dcuqsphx546x46` (`events_id`),
  KEY `FKlwwxfakjnire4l05x9utm2rbi` (`event_details_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `event_details_events`
--

LOCK TABLES `event_details_events` WRITE;
/*!40000 ALTER TABLE `event_details_events` DISABLE KEYS */;
/*!40000 ALTER TABLE `event_details_events` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `event_event_details`
--

DROP TABLE IF EXISTS `event_event_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `event_event_details` (
  `event_id` bigint(20) NOT NULL,
  `event_details_id` bigint(20) NOT NULL,
  KEY `FK2ino57wf6olyfdpqiyf0ir4q3` (`event_details_id`),
  KEY `FKnj83e5hsbvpw30qg42ltvxl9j` (`event_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `event_event_details`
--

LOCK TABLES `event_event_details` WRITE;
/*!40000 ALTER TABLE `event_event_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `event_event_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `league`
--

DROP TABLE IF EXISTS `league`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `league` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `region_id` bigint(20) DEFAULT NULL,
  `sport_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK8pqshhr804a7c00yrav80f49i` (`region_id`),
  KEY `FK11gkb0t51knp0pqxryy274iaw` (`sport_id`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `league`
--

LOCK TABLES `league` WRITE;
/*!40000 ALTER TABLE `league` DISABLE KEYS */;
INSERT INTO `league` VALUES (1,'Football PL League1',1,1),(2,'Football PL League2',1,1),(3,'Football EU Cup1',2,1),(4,'Tennis WorldCup 1',2,2),(5,'Tennis WorldCup 2',2,2),(6,'Tennis Cup PL',1,2),(7,'HorseRace PL Cup',1,3),(8,'HorseRace WorldCup 1',2,3),(9,'HorseRace WorldCup 2',2,3);
/*!40000 ALTER TABLE `league` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `league_teams`
--

DROP TABLE IF EXISTS `league_teams`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `league_teams` (
  `leagues_id` bigint(20) NOT NULL,
  `teams_id` bigint(20) NOT NULL,
  KEY `FK346p2kjh3ajaw1ia5vie3q11n` (`teams_id`),
  KEY `FK6ok713uwisushrgubocssxjiy` (`leagues_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `league_teams`
--

LOCK TABLES `league_teams` WRITE;
/*!40000 ALTER TABLE `league_teams` DISABLE KEYS */;
INSERT INTO `league_teams` VALUES (1,1),(1,2),(3,1),(3,3),(3,4),(4,5),(4,6),(5,5),(5,6),(8,7),(8,8),(8,9);
/*!40000 ALTER TABLE `league_teams` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `region`
--

DROP TABLE IF EXISTS `region`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `region` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `region`
--

LOCK TABLES `region` WRITE;
/*!40000 ALTER TABLE `region` DISABLE KEYS */;
INSERT INTO `region` VALUES (1,'Poland'),(2,'International'),(3,'UK');
/*!40000 ALTER TABLE `region` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `region_teams`
--

DROP TABLE IF EXISTS `region_teams`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `region_teams` (
  `regions_id` bigint(20) NOT NULL,
  `teams_id` bigint(20) NOT NULL,
  KEY `FKint6jmxxaimu7gdfcbwvqirfk` (`teams_id`),
  KEY `FK5dggb6bkflx6y1cnt2afsbt2a` (`regions_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `region_teams`
--

LOCK TABLES `region_teams` WRITE;
/*!40000 ALTER TABLE `region_teams` DISABLE KEYS */;
INSERT INTO `region_teams` VALUES (1,1),(1,2),(2,1),(2,3),(2,4),(3,3),(3,4),(2,5),(2,6),(2,7),(2,8),(2,9);
/*!40000 ALTER TABLE `region_teams` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sport`
--

DROP TABLE IF EXISTS `sport`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sport` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sport`
--

LOCK TABLES `sport` WRITE;
/*!40000 ALTER TABLE `sport` DISABLE KEYS */;
INSERT INTO `sport` VALUES (1,'football'),(2,'tennis'),(3,'horseracing');
/*!40000 ALTER TABLE `sport` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sport_regions`
--

DROP TABLE IF EXISTS `sport_regions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sport_regions` (
  `sports_id` bigint(20) NOT NULL,
  `regions_id` bigint(20) NOT NULL,
  KEY `FKe09d682878kdojqrq56b8kwvb` (`regions_id`),
  KEY `FKtqv5gbql2y09i54i3yp3l0w8y` (`sports_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sport_regions`
--

LOCK TABLES `sport_regions` WRITE;
/*!40000 ALTER TABLE `sport_regions` DISABLE KEYS */;
INSERT INTO `sport_regions` VALUES (1,1),(1,2),(2,1),(2,2),(3,1),(3,2);
/*!40000 ALTER TABLE `sport_regions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `team`
--

DROP TABLE IF EXISTS `team`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `team` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `sport_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKo46m2brikf08388go7l2l7bxq` (`sport_id`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `team`
--

LOCK TABLES `team` WRITE;
/*!40000 ALTER TABLE `team` DISABLE KEYS */;
INSERT INTO `team` VALUES (1,'Football Team1PL',1),(2,'Football Team2PL',1),(3,'Football Team1UK',1),(4,'Football Team2UK',1),(5,'Tennis Player 1',2),(6,'Tennis Player 2',2),(7,'Horse1',3),(8,'Horse2',3),(9,'Horse3',3);
/*!40000 ALTER TABLE `team` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `team_events`
--

DROP TABLE IF EXISTS `team_events`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `team_events` (
  `teams_id` bigint(20) NOT NULL,
  `events_id` bigint(20) NOT NULL,
  KEY `FKqmpm0dww2rmmpuiwdkx5yyfyn` (`events_id`),
  KEY `FKlxlovutpo7f0inhjd87p9gf16` (`teams_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `team_events`
--

LOCK TABLES `team_events` WRITE;
/*!40000 ALTER TABLE `team_events` DISABLE KEYS */;
INSERT INTO `team_events` VALUES (1,1),(2,1),(5,2),(6,2),(7,3),(8,3),(9,3);
/*!40000 ALTER TABLE `team_events` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-05-31 13:41:58
