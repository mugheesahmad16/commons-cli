/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// package org.apache.commons.cli;

// import org.openjdk.jmh.annotations.Benchmark;
// import org.openjdk.jmh.annotations.State;
// import org.openjdk.jmh.annotations.Scope;
// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.List;

// @State(Scope.Benchmark)
// public class MyBenchmark {

//     @Benchmark
//     public String stringBuilderConcat() {
//         StringBuilder sb = new StringBuilder();
//         for (int i = 0; i < 100; i++) {
//             sb.append("text");
//         }
//         return sb.toString();
//     }

//     @Benchmark
//     public String stringPlusConcat() {
//         String result = "";
//         for (int i = 0; i < 100; i++) {
//             result += "text";
//         }
//         return result;
//     }

//     @Benchmark
//     public List<Integer> arrayListAdd() {
//         List<Integer> list = new ArrayList<>();
//         for (int i = 0; i < 1000; i++) {
//             list.add(i);
//         }
//         return list;
//     }

//     @Benchmark
//     public List<Integer> linkedListAdd() {
//         List<Integer> list = new LinkedList<>();
//         for (int i = 0; i < 1000; i++) {
//             list.add(i);
//         }
//         return list;
//     }

//     public static void main(String[] args) throws Exception {
//         org.openjdk.jmh.Main.main(args);
//     }
// }