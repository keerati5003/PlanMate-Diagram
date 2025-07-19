@Entity
@Table(name = "focus_sessions")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FocusSession {
    @Id
    private UUID sessionId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "group_id", nullable = true)
    private StudyGroup group;

    private Timestamp startTime;

    private Timestamp endTime;

    private Integer durationMinutes;

    private Boolean isCompleted;
}
