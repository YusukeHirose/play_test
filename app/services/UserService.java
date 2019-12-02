package services;

import java.util.concurrent.CompletionStage;
import java.util.stream.Stream;

import javax.inject.Inject;

import models.db.User;
import repositories.UserRepository;

/** @author hiroseyusuke */
public class UserService {

  private final UserRepository userRepository;

  @Inject
  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  /**
   * ユーザー全件取得
   *
   * @return 取得したユーザーデータ
   */
  public CompletionStage<Stream<User>> getUsers() {
    return userRepository.getAll();
  }
}
