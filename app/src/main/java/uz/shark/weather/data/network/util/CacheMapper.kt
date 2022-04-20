package uz.shark.weather.data.network.util

abstract class CacheMapper<Entity, Local> {

    abstract fun mapFromEntity(entity: Entity): Local

    open fun mapFromEntityList(list: List<Entity>): List<Local> {
        return ArrayList<Local>().apply {
            list.forEach {
                add(mapFromEntity(it))
            }
        }
    }

/*
    open fun mapFromLocalList(list: List<Local>): List<Dto> {
        return ArrayList<Dto>().apply {
            list.forEach {
                add(mapFromLocal(it))
            }
        }
    }
*/
}