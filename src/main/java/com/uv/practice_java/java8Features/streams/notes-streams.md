# create streams
1. List -> Stream   => `list.stream()`
2. Array -> Stream  => `Arrays.stream(array)`
3. Stream.of()      => `Stream.of(1, 2, 3, 4, 5)`
4. Stream.generate() => `Stream.generate(() -> Math.random())`

# streams functions 

- `filter()`: Filters elements based on a predicate.
- `map()`: Transforms each element of the stream.
- `reduce()`: Combines all elements of the stream into a single value.
- `collect()`: Collects the elements of the stream into a collection.
- `sorted()`: Sorts the elements of the stream.
- `distinct()`: Removes duplicate elements from the stream.
- `limit()`: Limits the number of elements in the stream.
- `skip()`: Skips a specified number of elements in the stream.
- `findFirst()`: Returns the first element of the stream.
- `findAny()`: Returns any element of the stream.
- `count()`: Counts the number of elements in the stream.
-  mapToInt(), mapToDouble(), mapToLong(): Converts the elements of the stream to primitive types.
- `anyMatch()`: Checks if any element of the stream matches a given predicate.
- `allMatch()`: Checks if all elements of the stream match a given predicate.
- `noneMatch()`: Checks if no elements of the stream match a given predicate.
-  flatMap(): Flattens a stream of collections into a single stream of elements.


# Collectors
- `Collectors.toList()`: Collects the elements of the stream into a List.
- `Collectors.joining()`: Joins the elements of the stream into a single String.