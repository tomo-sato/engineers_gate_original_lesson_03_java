/* スキーマ（DB）作成 */
CREATE SCHEMA IF NOT EXISTS `eg_lesson` DEFAULT CHARACTER SET utf8 ;

/* ユーザー作成 */
CREATE USER 'eg_sns_user'@'localhost' IDENTIFIED BY 'eg_pass';

/* ユーザー権限設定 */
GRANT ALL PRIVILEGES ON eg_lesson.* TO 'eg_sns_user'@'localhost';
FLUSH PRIVILEGES;

/* ユーザー削除（※為念、消す方法。コメントを外して使用する。） */
-- DROP USER 'eg_sns_user'@'localhost';


/* メンバーテーブル作成 */
CREATE TABLE `members` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` varchar(32) NOT NULL COMMENT '名前',
  `age` varchar(32) NOT NULL COMMENT '年齢',
  `address` varchar(32) NOT NULL COMMENT '住所',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3 COMMENT='メンバー';
