package am.dx.dhruv.roomdbexample

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "dhruvDb")
data class Chapter(@PrimaryKey @ColumnInfo(name = "chapterName") val chapterName: String)
