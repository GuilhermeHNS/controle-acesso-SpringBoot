package io.github.GuilhermeHNS.controleAcesso.domain.user;

public record RegisterDTO(String login, String password, UserRole role) {
}
