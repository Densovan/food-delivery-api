package com.sovanden.model;

import com.sovanden.enums.NotificationChannel;
import com.sovanden.enums.NotificationType;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tbl_notification")
public class Notification extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String content;
    private NotificationType notificationType;
    private NotificationChannel notificationChannel;
    private Boolean read;
    private Long userId;
    private Long deviceId;
}
