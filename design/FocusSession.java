@Entity
@Table(name = "focus_sessions")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class FocusSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private StudySession session;

    private LocalDateTime startedAt;
    private LocalDateTime endedAt;

    private Boolean isShared;

    @ManyToOne
    private FocusSession sharedParent; // ถ้า join กับ session ของเพื่อน
}
