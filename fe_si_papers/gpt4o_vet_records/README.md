## Objective 
Track files associated with the paper
**classification_performance_and_reproducibility_of_gpt4omni_for_information_extraction_from_veterinary_electronic_health_records**
published in Frontiers of Veterinary Science 2025
<https://www.frontiersin.org/journals/veterinary-science/articles/10.3389/fvets.2024.1490030/full>

## Folders
- **llm_vet_records** This is the folder accompanying the publication as supplmentary:
The version linked in the paper is here: https://github.com/ucdavis/llm_vet_records
This folder is unlinked to the paper repo - to avoid changes & submodule issues
- **paper** versions of the paper (from presubmission, to submission and revisions)
- **records** This contains records pre and post deidentification. Records from 
<svm_archives/vmth/prior_versions/all_cats_ever_scripts/contains_free_text>
- **human_review**: contains instructions to human reviewers & original qualtrics
surveys and responses
- **tuning_set**: contains tuning cases and repeated tuning runs
- **pilot** contains Jonatans initial script and run
- **bedrock**: contains early bedrock experiments (exploratory analysis
during free trial week spring 2024


## Experiments
The llm calls in this projects are run from experiments folders (subfolders
 to <tuning_set>, <pilot> or <llm_vet_records/experiment> etc,
 Each experiments folder contains:
- Python script (.py) requiring the following info
  - **api_key**: instructions on how to get here: <https://docs.google.com/presentation/d/1SOwCdExa2KzD9E20f85NNiH_jpBXx-mHvKJuQDZLdXE/edit?slide=id.g38e28dab2b6_0_0#slide=id.g38e28dab2b6_0_0>
  - **azure_endpoint** (same as **api_key**)
  - **api_version**(leave as is?)
  - **deployment_name** (name of model, e.g. 'gpt-4o')
- Input data: 
  - tuning.json (contains 10 deidentified medical records for tuning)
  - test.json (contains 250 deidentified medical record for tuning)
- prompt.txt (contains the prompt)
- terminal: some contain terminal outputs (copy pasted)


  
