/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cms.transform.v20180308;

import com.aliyuncs.cms.model.v20180308.QueryMetricDataResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMetricDataResponseUnmarshaller {

	public static QueryMetricDataResponse unmarshall(QueryMetricDataResponse queryMetricDataResponse, UnmarshallerContext context) {
		
		queryMetricDataResponse.setRequestId(context.stringValue("QueryMetricDataResponse.RequestId"));
		queryMetricDataResponse.setCode(context.stringValue("QueryMetricDataResponse.Code"));
		queryMetricDataResponse.setMessage(context.stringValue("QueryMetricDataResponse.Message"));
		queryMetricDataResponse.setDatapoints(context.stringValue("QueryMetricDataResponse.Datapoints"));
		queryMetricDataResponse.setPeriod(context.stringValue("QueryMetricDataResponse.Period"));
	 
	 	return queryMetricDataResponse;
	}
}