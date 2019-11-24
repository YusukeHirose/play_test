# play_test
 java-playで色々試す用のリポジトリ
 
## 環境構築
* Java Version: adoptopen JDK11 
(Java version 確認コマンド: java -version)
* Sbt Version: 1.3.3
(sbt version 確認コマンド: sbt sbtVersion)
* Play Version: play framework 2.7

## フレームワーク導入
* `sbt new playframework/play-java-seed.g8` コマンド実行
* nameとorganization入力
* `sbt run` 実行
* localhost:9000 で welcome to play が表示されれば完了
* ctr-d でstop

## Submodule追加
* 別リポジトリに同様の手順でprojectを作成
* submoduleを管理するディレクトリを作成(今回はmoduleディレクトリ)
* moduleディレクトリに移動後 `git submodule add 追加するリポジトリのURL` 
* module以下にクローンされて、.gitmodulesファイルが作成されていることを確認

