# Host: localhost  (Version 5.5.27)
# Date: 2019-07-26 10:00:07
# Generator: MySQL-Front 6.0  (Build 2.20)


#
# Structure for table "appeal_table"
#

DROP TABLE IF EXISTS `appeal_table`;
CREATE TABLE `appeal_table` (
  `appeal_id` int(11) NOT NULL AUTO_INCREMENT,
  `paper_id` varchar(20) DEFAULT NULL,
  `course_id` varchar(20) DEFAULT NULL,
  `student_account` varchar(20) DEFAULT NULL,
  `teacher_account` varchar(20) DEFAULT NULL,
  `appeal_content` text,
  `teacher_reply` text,
  PRIMARY KEY (`appeal_id`),
  KEY `paper_id` (`paper_id`),
  KEY `course_id` (`course_id`),
  KEY `student_account` (`student_account`),
  KEY `teacher_account` (`teacher_account`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "appeal_table"
#


#
# Structure for table "course_table"
#

DROP TABLE IF EXISTS `course_table`;
CREATE TABLE `course_table` (
  `course_id` varchar(20) NOT NULL DEFAULT '',
  `course_name` varchar(20) NOT NULL,
  PRIMARY KEY (`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "course_table"
#


#
# Structure for table "exam_table"
#

DROP TABLE IF EXISTS `exam_table`;
CREATE TABLE `exam_table` (
  `exam_id` varchar(20) NOT NULL DEFAULT '',
  `exam_name` varchar(20) NOT NULL,
  `exam_begintime` varchar(50) NOT NULL DEFAULT '',
  `exam_period` int(11) NOT NULL DEFAULT '0',
  `exam_endtime` varchar(50) NOT NULL DEFAULT '',
  `course_id` varchar(20) NOT NULL DEFAULT '',
  `exam_discript` text,
  `paper_ids` text NOT NULL,
  `exam_place` varchar(50) NOT NULL DEFAULT '',
  `exam_supervisor` varchar(20) NOT NULL DEFAULT '',
  PRIMARY KEY (`exam_id`),
  KEY `course_id` (`course_id`),
  CONSTRAINT `exam_table_ibfk_2` FOREIGN KEY (`course_id`) REFERENCES `course_table` (`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "exam_table"
#


#
# Structure for table "exam_result_table"
#

DROP TABLE IF EXISTS `exam_result_table`;
CREATE TABLE `exam_result_table` (
  `exam_id` varchar(20) DEFAULT NULL,
  `exam_people` int(11) NOT NULL DEFAULT '0',
  `exam_passpeople` int(11) NOT NULL DEFAULT '0',
  `exam_average` int(11) NOT NULL DEFAULT '0',
  `course_id` varchar(20) NOT NULL DEFAULT '',
  KEY `exam_id` (`exam_id`),
  KEY `course_id` (`course_id`),
  CONSTRAINT `course_id` FOREIGN KEY (`course_id`) REFERENCES `course_table` (`course_id`),
  CONSTRAINT `exam_result_table_ibfk_1` FOREIGN KEY (`exam_id`) REFERENCES `exam_table` (`exam_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "exam_result_table"
#


#
# Structure for table "question_table"
#

DROP TABLE IF EXISTS `question_table`;
CREATE TABLE `question_table` (
  `question_id` varchar(20) NOT NULL DEFAULT '',
  `course_id` varchar(20) NOT NULL DEFAULT '',
  `question_type` varchar(20) NOT NULL DEFAULT '',
  `question_stem` text NOT NULL,
  `question_use` varchar(20) NOT NULL DEFAULT '',
  `question_answer` text NOT NULL,
  `question_pic` text,
  `question_point` int(11) NOT NULL DEFAULT '0',
  `question_maker` varchar(20) DEFAULT '',
  PRIMARY KEY (`question_id`),
  KEY `course_id` (`course_id`),
  CONSTRAINT `question_table_ibfk_1` FOREIGN KEY (`course_id`) REFERENCES `course_table` (`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "question_table"
#


#
# Structure for table "user_table"
#

DROP TABLE IF EXISTS `user_table`;
CREATE TABLE `user_table` (
  `user_account` varchar(20) NOT NULL DEFAULT '',
  `user_password` varchar(20) NOT NULL DEFAULT '',
  `user_permission` varchar(10) NOT NULL,
  PRIMARY KEY (`user_account`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "user_table"
#


#
# Structure for table "teacher_table"
#

DROP TABLE IF EXISTS `teacher_table`;
CREATE TABLE `teacher_table` (
  `user_account` varchar(20) DEFAULT NULL,
  `teacher_name` varchar(20) NOT NULL DEFAULT '',
  `teacher_tel` int(11) DEFAULT NULL,
  KEY `user_account` (`user_account`),
  CONSTRAINT `teacher_table_ibfk_1` FOREIGN KEY (`user_account`) REFERENCES `user_table` (`user_account`) ON DELETE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "teacher_table"
#


#
# Structure for table "paper_table"
#

DROP TABLE IF EXISTS `paper_table`;
CREATE TABLE `paper_table` (
  `paper_id` varchar(20) NOT NULL DEFAULT '',
  `course_id` varchar(20) NOT NULL DEFAULT '',
  `paper_questions` text NOT NULL,
  `producer_id` varchar(20) DEFAULT NULL,
  `paper_passpoints` int(11) NOT NULL DEFAULT '0',
  `paper_fullpoint` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`paper_id`),
  KEY `course_id` (`course_id`),
  KEY `producer_id` (`producer_id`),
  CONSTRAINT `paper_table_ibfk_2` FOREIGN KEY (`producer_id`) REFERENCES `teacher_table` (`user_account`),
  CONSTRAINT `paper_table_ibfk_1` FOREIGN KEY (`course_id`) REFERENCES `course_table` (`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "paper_table"
#


#
# Structure for table "teacher_course_table"
#

DROP TABLE IF EXISTS `teacher_course_table`;
CREATE TABLE `teacher_course_table` (
  `relation_id` int(20) NOT NULL AUTO_INCREMENT,
  `user_account` varchar(20) DEFAULT NULL,
  `course_id` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`relation_id`),
  KEY `course_id` (`course_id`),
  KEY `teacher_course_table_ibfk_1` (`user_account`),
  CONSTRAINT `teacher_course_table_ibfk_1` FOREIGN KEY (`user_account`) REFERENCES `teacher_table` (`user_account`),
  CONSTRAINT `teacher_course_table_ibfk_2` FOREIGN KEY (`course_id`) REFERENCES `course_table` (`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "teacher_course_table"
#


#
# Structure for table "student_table"
#

DROP TABLE IF EXISTS `student_table`;
CREATE TABLE `student_table` (
  `user_account` varchar(20) DEFAULT NULL,
  `student_name` varchar(20) NOT NULL DEFAULT '',
  `student_class` varchar(20) NOT NULL DEFAULT '',
  `student_tel` int(11) DEFAULT NULL,
  UNIQUE KEY `user_account` (`user_account`),
  CONSTRAINT `student_table_ibfk_1` FOREIGN KEY (`user_account`) REFERENCES `user_table` (`user_account`) ON DELETE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "student_table"
#


#
# Structure for table "answer_table"
#

DROP TABLE IF EXISTS `answer_table`;
CREATE TABLE `answer_table` (
  `answer_id` varchar(20) NOT NULL DEFAULT '',
  `exam_id` varchar(20) DEFAULT NULL,
  `student_account` varchar(20) DEFAULT NULL,
  `answer_content` text NOT NULL,
  `teacher_account` varchar(20) DEFAULT NULL,
  `paper_id` varchar(20) NOT NULL DEFAULT '',
  `answer_points` text,
  `answer_result` int(11) DEFAULT '0',
  PRIMARY KEY (`answer_id`),
  KEY `exam_id` (`exam_id`),
  KEY `student_account` (`student_account`),
  KEY `teacher_account` (`teacher_account`),
  KEY `paper_id` (`paper_id`),
  CONSTRAINT `answer_table_ibfk_3` FOREIGN KEY (`teacher_account`) REFERENCES `student_table` (`user_account`),
  CONSTRAINT `answer_table_ibfk_1` FOREIGN KEY (`exam_id`) REFERENCES `exam_table` (`exam_id`) ON DELETE SET NULL,
  CONSTRAINT `answer_table_ibfk_2` FOREIGN KEY (`student_account`) REFERENCES `student_table` (`user_account`) ON DELETE SET NULL,
  CONSTRAINT `paper_id` FOREIGN KEY (`paper_id`) REFERENCES `paper_table` (`paper_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "answer_table"
#


#
# Structure for table "student_course_table"
#

DROP TABLE IF EXISTS `student_course_table`;
CREATE TABLE `student_course_table` (
  `relation_id` int(20) NOT NULL AUTO_INCREMENT,
  `user_account` varchar(20) DEFAULT NULL,
  `course_id` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`relation_id`),
  KEY `course_id` (`course_id`),
  KEY `student_course_table_ibfk_1` (`user_account`),
  CONSTRAINT `student_course_table_ibfk_1` FOREIGN KEY (`user_account`) REFERENCES `student_table` (`user_account`),
  CONSTRAINT `student_course_table_ibfk_2` FOREIGN KEY (`course_id`) REFERENCES `course_table` (`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "student_course_table"
#

