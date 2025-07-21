import java.time.LocalDateTime;

@Entity
@Table(name = "study_sessions")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class StudySession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private LocalDateTime scheduledAt;
    private Boolean completed;
    private String subject;
    private Integer actualDurationInMinutes;

    @ManyToOne
    private User user;
}
