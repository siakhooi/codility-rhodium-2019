# Codility Challenge: Rhodium 2019

## TreeRange

- Difficulty: Hard
- Given a tree, calculate number of its subtrees whose vertex labels form a continuous range of integers.
- <https://app.codility.com/programmers/challenges/rhodium2019/>
- <https://app.codility.com/programmers/task/tree_range/>

## Versions

- Result
  - **Good: Correctness 100%, Performance 100%**.
  - `OK`: Correctness 100%, Performance <100%.
  - `Fail`: Correctness <100%.
- File naming convention
  - Code `A1`: `Rhodium2019A1.java`
  - etc

| File | Complexity                      | Method          | Description                     | Result   | Report                                                                  |
| ---- | ------------------------------- | --------------- | ------------------------------- | -------- | ----------------------------------------------------------------------- |
| `A1` | `O(N**3)` or `O(N**3 * log(N))` | `ArrayList<<>>` | Visiting Connections            | OK (45%) | [PJQM65-YNK](https://app.codility.com/demo/results/trainingPJQM65-YNK/) |
| `A2` | `O(N**3)` or `O(N**3 * log(N))` | `ArrayList<<>>` | move visited up 1 level         | OK (45%) | [44PU6-6G3](https://app.codility.com/demo/results/trainingK44PU6-6G3/)  |
| `B1` | `O(N**2)`                       | `int[][]`       |                                 | OK (81%) | [R6G2Y3-DKR](https://app.codility.com/demo/results/trainingR6G2Y3-DKR/) |
| `B2` | `O(N**2)`                       | `int[][]`       | remove unnecessary sort         | OK (81%) | [7V5WVA-MPW](https://app.codility.com/demo/results/training7V5WVA-MPW/) |
| `B3` | `O(N**2)`                       | `int[][]`       | use `stackstart` to reduce sort | OK (81%) | [WX52CG-5VV](https://app.codility.com/demo/results/trainingWX52CG-5VV/) |
| `B4` | `O(N**2)`                       | `int[][]`       | use `mergeSortedArrays`         | OK (81%) | [D7RAC7-BAA](https://app.codility.com/demo/results/trainingD7RAC7-BAA/) |
| `B5` | `O(N**2)`                       | `int[][]`       | check `w==0`                    | **Good** | [BEV4JV-TN2](https://app.codility.com/demo/results/trainingBEV4JV-TN2/) |
