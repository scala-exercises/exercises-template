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

import org.scalatest.matchers.should.Matchers
import org.scalaexercises.definitions._
import org.scalatest.flatspec.AnyFlatSpec

/**
 * @param name section_title
 */
object SectionA extends AnyFlatSpec with Matchers with Section {

  /**
   * = Exercise block title =
   *
   * Text describing background about the exercise, can be as long as needed.
   *
   * {{{
   *   // Scala code blocks can also be added to enhance your documentation.
   * }}}
   *
   * Also, documentation can be broken in as many paragraphs as necessary.
   */
  def functionAssert(res0: Boolean): Unit =
    true shouldBe res0

  /**
   * And obviously you can add as many documentation and exercises as you need
   * to make your point ;-).
   */
  def functionFalseAssert(res0: Boolean): Unit =
    false shouldBe res0
}
