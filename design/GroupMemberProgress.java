@Entity
@Table(name = "group_member_progress")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GroupMemberProgress {
    @Id
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private StudyGroup group;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Integer totalFocusMinutes;

    private Integer completedTaskCount;

    private Timestamp lastUpdated;
}
