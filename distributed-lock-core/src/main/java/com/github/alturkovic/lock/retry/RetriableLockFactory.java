/*
 * MIT License
 *
 * Copyright (c) 2020 Alen Turkovic
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.github.alturkovic.lock.retry;

import com.github.alturkovic.lock.Lock;
import com.github.alturkovic.lock.Locked;

/**
 * Factory for producing {@link RetriableLock} instances.
 */
public interface RetriableLockFactory {

  /**
   * Generates a {@link RetriableLock} that will retry {@code lock} token acquisition logic as specified by {@code locked}.
   *
   * If no retry is required, it will return the given {@code lock}.
   *
   * @param lock   lock which {@link Lock#acquire} logic should be retried
   * @param locked annotation describing how to retry
   * @return a retriable lock version of {@code lock}
   */
  Lock generate(Lock lock, Locked locked);
}
