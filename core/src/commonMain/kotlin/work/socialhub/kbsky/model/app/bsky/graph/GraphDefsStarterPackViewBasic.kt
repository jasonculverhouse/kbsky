package work.socialhub.kbsky.model.app.bsky.graph

import kotlinx.serialization.Serializable
import work.socialhub.kbsky.model.app.bsky.actor.ActorDefsProfileViewBasic
import work.socialhub.kbsky.model.com.atproto.label.LabelDefsLabel
import work.socialhub.kbsky.model.share.RecordUnion

@Serializable
data class GraphDefsStarterPackViewBasic(
    val uri: String,
    val cid: String,
    val record: RecordUnion,
    val creator: ActorDefsProfileViewBasic,
    val listItemCount: Int? = null,
    val joinedWeekCount: Int? = null,
    val joinedAllTimeCount: Int? = null,
    val labels: List<LabelDefsLabel>? = null,
    val indexedAt: String
)