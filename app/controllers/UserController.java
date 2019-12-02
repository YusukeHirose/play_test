package controllers;

import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;

import javax.inject.Inject;

import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.UserService;

/** @author hiroseyusuke */
public class UserController extends Controller {

  private final UserService userService;

  @Inject
  public UserController(UserService userService) {
    this.userService = userService;
  }

  /**
   * ユーザー全件取得
   *
   * @return 取得したユーザーデータ
   */
  public CompletionStage<Result> getUsers() {
    var users = userService.getUsers();
    return users.thenApply(userStream -> ok(Json.toJson(userStream.collect(Collectors.toList()))));
  }
}
