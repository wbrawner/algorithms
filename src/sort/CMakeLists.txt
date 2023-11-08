add_library(sort-lib selection.hpp selection.cpp)

add_executable(sort sort.cpp)

target_link_libraries(sort sort-lib util)

add_test(
    NAME bubble-sort
    COMMAND $<TARGET_FILE:sort> bubble ${CMAKE_SOURCE_DIR}/data/numbers_unsorted.txt ${CMAKE_SOURCE_DIR}/data/numbers.txt
)

add_test(
    NAME insertion-sort
    COMMAND $<TARGET_FILE:sort> insertion ${CMAKE_SOURCE_DIR}/data/numbers_unsorted.txt ${CMAKE_SOURCE_DIR}/data/numbers.txt
)

add_test(
    NAME merge-sort
    COMMAND $<TARGET_FILE:sort> merge ${CMAKE_SOURCE_DIR}/data/numbers_unsorted.txt ${CMAKE_SOURCE_DIR}/data/numbers.txt
)

add_test(
    NAME selection-sort
    COMMAND $<TARGET_FILE:sort> selection ${CMAKE_SOURCE_DIR}/data/numbers_unsorted.txt ${CMAKE_SOURCE_DIR}/data/numbers.txt
)

add_test(
    NAME shell-sort
    COMMAND $<TARGET_FILE:sort> shell ${CMAKE_SOURCE_DIR}/data/numbers_unsorted.txt ${CMAKE_SOURCE_DIR}/data/numbers.txt
)

add_test(
    NAME quick-sort
    COMMAND $<TARGET_FILE:sort> quick ${CMAKE_SOURCE_DIR}/data/numbers_unsorted.txt ${CMAKE_SOURCE_DIR}/data/numbers.txt
)
