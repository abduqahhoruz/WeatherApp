package uz.shark.weather.data.network.util

abstract class NetworkMapper<Dto, Local> {

    abstract fun mapFromDto(dto: Dto): Local

    open fun mapFromDtoList(list: List<Dto>): List<Local> {
        return ArrayList<Local>().apply {
            list.forEach {
                add(mapFromDto(it))
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