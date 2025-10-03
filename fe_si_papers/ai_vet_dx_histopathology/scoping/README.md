## Objective
Contains material & scripts associated with the scoping review

## Subfolders
- **scripts**: Contains scripts for performing and analyzing scoping review
  - **lit_search**: Script for iterative scopus searches, and intermediate
  result analysis (sensitivity and specificity of different query versions)
  - **analyze_vet_papers**: Script for analyzing manually extracted info for vet
  papers - generates results figure for paper (Fig. 6) and supplemental table 2 
  latest updated was manual)
- **input**: Contains input files for the scripts
  - **elsevier_api_key.txt**: received through Elsevier API service
  - **priors**: A spreadsheet of papers I knew I wanted the search to identify, 
  used to estimate sensitivity of search terms 
  - **retreived_vet**: some of the identified papers (not all required downloading to
  review)
  - **reviewed_lit_search**: contains manually reviewed title/abstracts for different versions
  and a subfolder 
  - **reviewed_reports**: contains manually reviewed studies 
- **output**: Contains output from scripts 
  - **analyze_vet_papers**: Contains output figures and tables from the "analyze_vet_papers" script
  - **lit_search**: Contains results, metadata and templates for manually reviewing
  results of search results for different versions of queries (called in script lit_search)
  - **priors**: Contains iteratively updated true positives from previous searches 
  to assess sensitivity of other queries.
- **pub_med**: Contains queries and results for pubmed searches (used webinterface)


