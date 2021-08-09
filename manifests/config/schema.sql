DROP TABLE IF EXISTS `messages`;

CREATE TABLE `messages` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `created` date DEFAULT NULL,
    `message` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

