/**
 * Copyright 2008 - CommonCrawl Foundation
 * 
 * CommonCrawl licenses this file to you under the Apache License, 
 * Version 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.commoncrawl.crawl.crawler.listcrawler;

/**
 * A cache flush request 
 * 
 * @author rana
 *
 */
class CacheFlushRequest { 

  public enum RequestType { 
    FlushRequest,
    ExitThreadRequest
  }
  
  public CacheFlushRequest.RequestType  _requestType;
  public long _bytesToFlush;
  public int  _itemsToFlush;
  
  CacheFlushRequest(long bytesToFlush, int itemsToFlush) {
    _requestType  = RequestType.FlushRequest;
    _bytesToFlush = bytesToFlush;
    _itemsToFlush = itemsToFlush;
  }
  
  CacheFlushRequest() { 
    _requestType = RequestType.ExitThreadRequest;
  }
  
}