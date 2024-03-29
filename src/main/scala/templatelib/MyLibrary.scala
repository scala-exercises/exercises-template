/*
 * Copyright 2016-2020 47 Degrees Open Source <https://www.47deg.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package templatelib
import org.scalaexercises.definitions._

/**
 * This is the description of the library as it will appear in the Scala Exercises website.
 *
 * @param name
 *   template
 */
object MyLibrary extends Library {
  override def owner      = "scala-exercises"
  override def repository = "scala-exercises"
  override def color      = Some("#323232")

  override def sections =
    List(
      SectionA
    )

  override def logoPath = ""
}
