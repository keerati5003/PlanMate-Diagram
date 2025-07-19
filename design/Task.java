@Entity
@Table(name = "tasks")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Task {
    @Id
    private UUID taskId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "group_id", nullable = true)
    private StudyGroup group;

    private String title;

    @Column(length = 1000)
    private String description;

    private Boolean isCompleted;

    private Timestamp completedAt;
}
