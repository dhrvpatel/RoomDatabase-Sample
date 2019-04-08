package am.dx.dhruv.roomdbexample

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

@Dao
interface ChapterDao {

    @Insert
    fun insert(vararg chapter: Chapter)

    @Query("SELECT * FROM dhruvDb ORDER BY chapterName ASC")
    fun getAllChapter(): List<Chapter>

}