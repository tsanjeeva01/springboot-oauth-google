package com.demo.entity;

import lombok.Data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This table will be used automatically by  Spring Social API.
 * It stores user's public information obtained from the social network such as
 * ProviderId, ProviderUserId, Displayname, ImageUrl etc.
 */
@Data
@Entity
@Table(name = "Userconnection")
public class UserConnection implements Serializable {

    private static final long serialVersionUID = -6991752510891411572L;

    @Id
    @Column(name = "Userid", nullable = false)
    private String userId;

    @Id
    @Column(name = "Providerid", nullable = false)
    private String providerId;

    @Id
    @Column(name = "Provideruserid", nullable = false)
    private String providerUserId;

    @Column(name = "Ranks", nullable = false)
    private int ranks;

    @Column(name = "Displayname", length = 255, nullable = true)
    private String displayName;

    @Column(name = "Profileurl", length = 512, nullable = true)
    private String profileUrl;

    @Column(name = "Imageurl", length = 512, nullable = true)
    private String imageUrl;

    @Column(name = "Accesstoken", length = 512, nullable = true)
    private String accessToken;

    @Column(name = "Secret", length = 512, nullable = true)
    private String secret;

    @Column(name = "Refreshtoken", length = 512, nullable = true)
    private String refreshToken;

    @Column(name = "Expiretime", nullable = true)
    private Long expireTime;

}
