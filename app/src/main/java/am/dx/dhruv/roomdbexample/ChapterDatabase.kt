package am.dx.dhruv.roomdbexample

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context


@Database(entities = arrayOf(Chapter::class), version = 1)
abstract class ChapterDatabase : RoomDatabase() {

    abstract fun chapterDao(): ChapterDao

    companion object {
        private var INSTANCE: ChapterDatabase? = null
        fun getDatabase(context: Context): ChapterDatabase? {
            if (INSTANCE == null) {
                synchronized(ChapterDatabase::class) {
                    INSTANCE =
                        Room.databaseBuilder(context.applicationContext, ChapterDatabase::class.java, "chapter.db")
                            .allowMainThreadQueries().build()
                }
            }
            return INSTANCE
        }
    }
}